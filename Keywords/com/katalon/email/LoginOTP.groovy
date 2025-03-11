package com.katalon.email

import java.util.regex.Matcher
import java.util.regex.Pattern

import javax.mail.BodyPart
import javax.mail.Folder
import javax.mail.Message
import javax.mail.Session
import javax.mail.Store
import javax.mail.internet.MimeMultipart

import org.jsoup.Jsoup

import com.kms.katalon.core.annotation.Keyword

import internal.GlobalVariable as GlobalVariable



public class LoginOTP {

	@Keyword
	public String getOTPGmail() {
		String mailFolderName = GlobalVariable.mailFolderName

		String emailSubjectContent = GlobalVariable.emailSubjectContent

		String emailContent = GlobalVariable.emailContent

		int lengthOfOTP = 5

		String hostName = 'imap.gmail.com' //change it according to your mail

		String username = GlobalVariable.username //username

		String password = GlobalVariable.password

		String searchText = null

		Properties sysProps = new Properties()

		sysProps.put('mail.store.protocol', 'imaps')

		sysProps.put('mail.imaps.socketFactory.class', 'javax.net.ssl.SSLSocketFactory')

		sysProps.put('mail.imaps.socketFactory.fallback', 'false')

		sysProps.put('mail.imaps.port', '993')

		sysProps.put('mail.imaps.socketFactory.port', '993')

		sysProps.put("mail.imaps.ssl.protocols", "TLSv1.2")

		Session session = Session.getDefaultInstance(sysProps, null)

		//session.setDebug(true)
		Store store = session.getStore('imaps')

		store.connect(hostName, username, password)

		Folder emailFolder = store.getFolder(mailFolderName)

		emailFolder.open(Folder.READ_ONLY)

		// retrieve the messages from the folder in an array and print it
		Message[] messages = emailFolder.getMessages()

		System.out.println('messages.length---' + messages.length)

		int msglen = messages.length - 1

		for (int i = msglen; i >= 0; i--) {
			Message message = messages[i]

			System.out.println('---------------------------------')

			//System.out.println('Email Number ' + (i + 1))
			//System.out.println('Subject: ' + message.getSubject())
			//System.out.println('From: ' + (message.getFrom()[0]))
			Object content = message.getContent()

			if (message.getSubject().startsWith(emailSubjectContent)) {
				if (content instanceof String) {
					//System.out.println('Email Number ' + (i + 1))

					//System.out.println('Subject: ' + message.getSubject())

					//System.out.println('From: ' + (message.getFrom()[0]))

					//System.out.println('Text: ' + content)

					String intOTP = extractOTPNumbers(content)

					System.out.println('OTP from Gmail is: ' + intOTP)
					return intOTP

					break
				} else if (content instanceof MimeMultipart) {
					System.out.println('Email Number ' + (i + 1))

					System.out.println('Subject Multipart: ' + message.getSubject())

					System.out.println('From Multipart: ' + (message.getFrom()[0]))

					System.out.println('Text Multipart: ' + getMutipartMessage(content))

					String intOTP = extractOTPNumbers(getMutipartMessage(content))

					System.out.println('OTP from Gmail is: ' + intOTP)
					return intOTP

					break
				}
			}
		}
		emailFolder.close(false)

		store.close()
	}

	def getMutipartMessage(MimeMultipart mimeMultipart) {
		String result = ''

		int count = mimeMultipart.getCount()

		for (def j : (0..count - 1)) {
			BodyPart bodyPart = mimeMultipart.getBodyPart(j)

			if (bodyPart.isMimeType('text/plain')) {
				result = ((result + '\n') + bodyPart.getContent())

				break
			} else if (bodyPart.isMimeType('text/html')) {
				String html = ((bodyPart.getContent()) as String)

				result = ((result + '\n') + Jsoup.parse(html).text())
			}
		}

		return result
	}

	def String extractOTP(String msgcontent) {
		Pattern p1 = Pattern.compile('This is your OTP for Gmail: ([0-9]+)')

		Matcher m1 = p1.matcher(msgcontent)

		if (m1.find()) {
			return m1.group(1)
		}
	}

	def String extractOTPNumbers(String input) {
		def matcher = (input =~ /\d+/)
		return matcher ? matcher[0] : ""  // Return first matched number or empty string if no match
	}
}
