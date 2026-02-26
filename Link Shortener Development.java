import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;
public class UrlShortenerApplication
{
    public static void main(String args[])
    {
        SpringApplication.run(UrlShortenerApplication.class,args);
    }
}
@RestController
@RequestMapping("/api");
class UrlShortenerController {
    private Map<String,String>urlMap=new HashMap<>();
    @PostMapping("/shorten")
    public String shortenUrl(@RequestParam String url)
    {
        String shortUrl=Integer.toHexString(url.hashCode());
        urlMap.put(shortUrl,url);
        return "Short URL is:https://localhost:8080/api" + shortUrl;
    }
    @GetMapping("/{shortUrl}")
    public void redirectUrl@pathVariable String shortUrl,HttpServletResponse(response) throws IOException 
    {
        String originalUrl=urlMap.get(shortUrl);
        if(originalUrl !=null)
        {
            response.sendRedirect(originalUrl);
        }
        else
        {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
        }
    }
