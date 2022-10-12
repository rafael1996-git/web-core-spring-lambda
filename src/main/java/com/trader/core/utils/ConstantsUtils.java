package com.trader.core.utils;

public class ConstantsUtils {
    public static final long MAX_FILE_SIZE_LAMBDA_ALLOWED = 10024000L;

    public static final String MISSING_PARAMETER = "You have a missing parameter";
    public static final String BAD_REQUEST = "Please verify your request";
    public static final String ERROR_CONNECTION_BD = "Error de conexión a la BD";

    public static final String ENDPOINT_HEALTH_CHECK = "/health";
    public static final String ENDPOINT_MISSING_PARAMETER = "/missingParameter";
    public static final String ENDPOINT_ERROR = "/error";
    public static final String REQUEST_TYPE_JSON = "application/json";
    public static final String RESPONSE_TYPE_JSON = "application/json";
    public static final String HEALTH_CHECK_OK = "This health check is working ok";
    public static final String MALFORMED_REQUEST = "You request is malformed";
}