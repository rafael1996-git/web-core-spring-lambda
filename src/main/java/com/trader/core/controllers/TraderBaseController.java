package com.trader.core.controllers;

import com.trader.core.utils.ConstantsUtils;
import com.trader.core.utils.JsonConstantsUtils;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

public abstract class TraderBaseController implements ErrorController {
    public static void main(String[] args) {
    }

    public abstract HashMap healthCheck();
    public abstract HashMap getStatus(boolean withDB);

    @Override
    public String getErrorPath() {
        return "/errors";
    }

    @RequestMapping(ConstantsUtils.ENDPOINT_ERROR)
    public final HashMap handleError() {
        HashMap map = new HashMap();
        map.put(JsonConstantsUtils.PROPERTY_NAME_SUCCESS, Boolean.FALSE);
        map.put(JsonConstantsUtils.PROPERTY_NAME_MESSAGE, ConstantsUtils.BAD_REQUEST);

        return map;
    }

    @RequestMapping(ConstantsUtils.ENDPOINT_MISSING_PARAMETER)
    protected final HashMap missingParameter() {
        HashMap map = new HashMap();
        map.put(JsonConstantsUtils.PROPERTY_NAME_SUCCESS, Boolean.FALSE);
        map.put(JsonConstantsUtils.PROPERTY_NAME_MESSAGE, ConstantsUtils.MISSING_PARAMETER);

        return map;
    }

    protected final HashMap errorParsingRequest() {
        HashMap map = new HashMap();
        map.put(JsonConstantsUtils.PROPERTY_NAME_SUCCESS, Boolean.FALSE);
        map.put(JsonConstantsUtils.PROPERTY_NAME_MESSAGE, ConstantsUtils.MALFORMED_REQUEST + ": STRING_CANT_BE_DECRYPTED");

        return map;
    }
}
