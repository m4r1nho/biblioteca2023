@Controller
public class IndexController {
    @RequestMapping("/")
    public String home() {
        return "WEB-INF/home";
    }
}

