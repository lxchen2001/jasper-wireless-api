
package com.jasperwireless.api.ws.schema;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "OrderPortType", targetNamespace = "http://api.jasperwireless.com/ws/schema")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OrderPortType {


    /**
     * 
     * @param body
     * @return
     *     returns com.jasperwireless.api.ws.schema.UpdateOrderStatusResponse
     */
    @WebMethod(operationName = "UpdateOrderStatus", action = "http://api.jasperwireless.com/ws/service/terminal/UpdateOrderStatus")
    @WebResult(name = "UpdateOrderStatusResponse", targetNamespace = "http://api.jasperwireless.com/ws/schema", partName = "body")
    public UpdateOrderStatusResponse updateOrderStatus(
        @WebParam(name = "UpdateOrderStatusRequest", targetNamespace = "http://api.jasperwireless.com/ws/schema", partName = "body")
        UpdateOrderStatusRequest body);

    /**
     * 
     * @param body
     * @return
     *     returns com.jasperwireless.api.ws.schema.AdvanceShipmentNotificationResponse
     */
    @WebMethod(operationName = "AdvanceShipmentNotification", action = "http://api.jasperwireless.com/ws/service/order/AdvanceShipmentNotification")
    @WebResult(name = "AdvanceShipmentNotificationResponse", targetNamespace = "http://api.jasperwireless.com/ws/schema", partName = "body")
    public AdvanceShipmentNotificationResponse advanceShipmentNotification(
        @WebParam(name = "AdvanceShipmentNotificationRequest", targetNamespace = "http://api.jasperwireless.com/ws/schema", partName = "body")
        AdvanceShipmentNotificationRequest body);

}