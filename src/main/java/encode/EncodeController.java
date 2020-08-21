package encode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EncodeController {

    private EncodeService encodeService;

    public EncodeController(final EncodeService encodeServiceParam) {
        this.encodeService = encodeServiceParam;
    }

    @GetMapping("/encode")
    public String getEncodedString(@RequestParam("stringToEncode") String stringToEncode) {
        return this.encodeService.encodeString(stringToEncode);
    }

}
