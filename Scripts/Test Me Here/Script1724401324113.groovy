import java.util.regex.Matcher as Matcher
import java.util.regex.Pattern as Pattern
import javax.mail.BodyPart as BodyPart
import javax.mail.Folder as Folder
import javax.mail.Message as Message
import javax.mail.Session as Session
import javax.mail.Store as Store
import javax.mail.internet.MimeMultipart as MimeMultipart
import org.jsoup.Jsoup as Jsoup
import com.kms.katalon.core.annotation.Keyword as Keyword
import internal.GlobalVariable as GlobalVariable

def String extractOTPNumbers(String input) {
    def matcher = (input =~ /\d+/)
    return matcher ? matcher[0] : ""  // Return first matched number or empty string if no match
}

// Example usage
String text = "Hi there kindly use this as your one time confirmation code  <b>205251</b>"

String intOTP = extractOTPNumbers(text)

println(intOTP)  // Output: 205251
