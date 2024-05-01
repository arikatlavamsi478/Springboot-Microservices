package Controller;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/table")
public class TableController {
    @Autowired
    EntityManager entityManager;
    @ResponseBody
    @GetMapping("/demo71")
    public String getData() {
        Query sqlQuery= entityManager.createNativeQuery("select name from vamsi_table");
        List<String> result= sqlQuery.getResultList();
        StringBuilder sb=new StringBuilder();
        Iterator itr= result.iterator();
        while(itr.hasNext()) {
            sb.append(itr.next()+" ");
        }
        return sb.toString();
    }
}