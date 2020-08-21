package encode;

import org.springframework.stereotype.Service;

import java.util.Base64;

@Service
public class EncodeServiceImpl implements EncodeService {
    @Override
    public String encodeString(String stringToEncode) {
        return Base64.getEncoder().encodeToString(stringToEncode.getBytes());
    }
}
