package org.swasth.apigateway.exception;

public enum ErrorCodes {
    ERR_MANDATORY_HEADERFIELD_MISSING,
    ERR_INVALID_TIMESTAMP,
    ERR_INVALID_WORKFLOW_ID,
    ERR_INVALID_DEBUG_FLAG,
    ERR_INVALID_STATUS,
    ERR_INVALID_ERROR_DETAILS,
    ERR_INVALID_DEBUG_DETAILS,
    ERR_INVALID_PAYLOAD,
    ERR_INVALID_API_CALL_ID,
    ERR_INVALID_CORRELATION_ID,
    ERR_INVALID_SENDER,
    ERR_INVALID_RECIPIENT,
    ERR_INVALID_SENDER_AND_RECIPIENT,
    ERR_ACCESS_DENIED,
    ERR_INVALID_FORWARD_REQ,
    INTERNAL_SERVER_ERROR,
    SERVICE_UNAVAILABLE,
    ERR_INVALID_REDIRECT_TO,
    ERR_INVALID_NOTIFICATION_ID,
    ERR_INVALID_NOTIFICATION_DATA
}
