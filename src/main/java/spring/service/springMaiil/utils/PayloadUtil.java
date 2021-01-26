package spring.service.springMaiil.utils;


import spring.service.springMaiil.pojos.ResponsePayload;

public class PayloadUtil {

    //    set reponse payload
    public static ResponsePayload setPayload(String msg, int code, String records, Object data){
        ResponsePayload payload = new ResponsePayload();

        payload.setStatus(msg);
        payload.setCode(code);
        payload.setRecords(Integer.parseInt(records));
        payload.setData(data);

        return payload;
    }
}
