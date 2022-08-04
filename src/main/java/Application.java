import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImp;

public class Application {

    public static void main(String args[]){
        SpeakerService service = new SpeakerServiceImp();

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
