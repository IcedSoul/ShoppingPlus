package cn.icedsoul.paymentservice.Utils;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response {
    private Integer state;
    private String message;
    private Object content;
}
