package com.trader.core.utils;

import com.google.gson.JsonObject;
import com.trader.core.models.BaseModel;
import com.trader.core.models.MessageModel;
import com.trader.core.models.ResponseModel;
import com.trader.core.enums.ResponseEnum;

import java.util.List;

public class ResponseUtils extends BaseModel {
    private static ResponseModel createResponse(int code,
                                                boolean success,
                                                MessageModel messageModel,
                                                List<JsonObject> items) throws Exception {
        ResponseModel responseModel = new ResponseModel();
        responseModel.setCode(code);
        responseModel.setSuccess(success);
        responseModel.setMessage(messageModel);
        responseModel.setItems(items);

        return responseModel;
    }

    public static ResponseModel createResponse(List<JsonObject> items,
                                               ResponseEnum responseEnum) {
        try {
            return createResponse(responseEnum.getCode(),
                                  responseEnum.isSuccess(),
                                  new MessageModel(responseEnum.getId(),
                                                   responseEnum.getMessage(),
                                                    responseEnum.getDescription(),
                                                    responseEnum.getsCode()),
                                  items);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ResponseModel createResponseWithMessage(List<JsonObject> items,
                                                          ResponseEnum responseEnum,
                                                          String message) {
        try {
            return createResponse(responseEnum.getCode(),
                                  responseEnum.isSuccess(),
                                  new MessageModel(responseEnum.getId(),
                                                   message,
                                                   responseEnum.getDescription(),
                                                   responseEnum.getsCode()),
                                  items);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
