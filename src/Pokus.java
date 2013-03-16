import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Pokus {

	/**
	 * @param argslololololo
	 */
	public static void main(String[] args) {
		try{
		digest("a,12450sasspjmxcvmnvpúxcjncviovxadda54664as45545");
	}catch (NoSuchAlgorithmException e){
		System.exit(1);
	}
	catch (UnsupportedEncodingException e){
		System.exit(1);
	}

	}

	public static void digest(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        digest.update(password.getBytes("UTF-8"));
		
        byte byteArr[] = digest.digest();			
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteArr.length; i++) {
        	sb.append(Integer.toString((byteArr[i] & 0xff) + 0x100, 16).substring(1));
        	
        	
        }
        System.out.println(sb.toString());
    }
}
