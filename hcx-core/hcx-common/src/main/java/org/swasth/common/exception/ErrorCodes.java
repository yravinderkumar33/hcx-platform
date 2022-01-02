package org.swasth.common.exception;

public enum ErrorCodes {
    CLIENT_ERR_INVALID_PAYLOAD,
    CLIENT_ERR_MANDATORY_HEADERFIELD_MISSING,
    CLIENT_ERR_INVALID_REQ_PROTECTED,
    CLIENT_ERR_INVALID_SENDER,
    CLIENT_ERR_INVALID_RECIPIENT,
    CLIENT_ERR_INVALID_REQ_ID,
    CLIENT_ERR_INVALID_CORREL_ID,
    CLIENT_ERR_INVALID_WORKFLOW_ID,
    CLIENT_ERR_INVALID_TIMESTAMP,
    CLIENT_ERR_INVALID_DEBUG_ID,
    CLIENT_ERR_INVALID_STATUS,
    CLIENT_ERR_INVALID_ERROR_DETAILS,
    CLIENT_ERR_INVALID_DEBUG_DETAILS,
    CLIENT_ERR_DEBUG_ID_OUTOFRANGE,
    CLIENT_ERR_STATUS_OUTOFRANGE,
    CLIENT_ERR_ERROR_DETAILS_OUTOFRANGE,
    CLIENT_ERR_DEBUG_DETAILS_OUTOFRANGE,
    CLIENT_ERR_INVALID_PARTICIPANT_DETAILS,
    SERVICE_UNAVAILABLE,
    INTERNAL_SERVER_ERROR,
    SERVER_ERR_GATEWAY_TIMEOUT,
    SERVER_ERROR
}
