package ObjectClass.HashCode;

public class HashcodeExample {
    int i;


    public int hashCode(){
        return i;
    }

    public static void main(String[] args) {
        HashcodeExample hash=new HashcodeExample();
        HashcodeExample hash1=new HashcodeExample();

        System.out.println(hash1.hashCode());
        System.out.println(hash.hashCode());
    }
}
