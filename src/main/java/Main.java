import com.generated.BZPPublicWebService;
import com.generated.BZPPublicWebServiceHttpPost;
import com.generated.BZPPublicWebServiceHttpPostImpl;

public class Main {
    public static void main(String[] args) throws Exception {
        BZPPublicWebServiceHttpPost bzpPublicWebServiceHttpPost = new BZPPublicWebServiceHttpPostImpl();
        int res = bzpPublicWebServiceHttpPost.ileOgloszenK4();
        System.out.println(res);
    }
}
