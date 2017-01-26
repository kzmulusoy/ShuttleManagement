package com.shuttlemanagement.handler;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mongodb.MongoSocketOpenException;

/**
 * The Class GlobalExceptionHandler.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Instantiates a new global exception handler.
     */
    public GlobalExceptionHandler() {
        // UNIMPLEMENTED
    }
    
    /**
     * Handle error.
     *
     * @param response the response
     * @param exception the exception
     */
    @ExceptionHandler(Exception.class)
    public void handleError(HttpServletResponse response, Exception exception) {
        handleRequest(response, exception, HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    }
    
    /**
     * Handle mongo socket open exception.
     *
     * @param response the response
     * @param exception the exception
     */
    @ExceptionHandler(MongoSocketOpenException.class)
    public void handleMongoSocketOpenException(HttpServletResponse response, Exception exception) {
        handleRequest(response, exception, HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    }
    
    
    /**
     * Handle data access resource failure exception.
     *
     * @param response the response
     * @param exception the exception
     */
    @ExceptionHandler(DataAccessResourceFailureException.class)
    public void handleDataAccessResourceFailureException(HttpServletResponse response, Exception exception) {
        handleRequest(response, exception, HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    }
    
    /**
     * Handle http message not readable exception.
     *
     * @param response the response
     * @param exception the exception
     */
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public void handleHttpMessageNotReadableException(HttpServletResponse response, Exception exception) {
        handleRequest(response, exception, HttpServletResponse.SC_BAD_REQUEST);
    }
    
    /**
     * Handle request.
     *
     * @param response the response
     * @param exception the exception
     * @param scBadRequest the sc bad request
     */
    private void handleRequest(HttpServletResponse response, Exception exception, int scBadRequest) {
        response.setStatus(scBadRequest);
        addExceptionToResponse(response, exception);
    }

    /**
     * Adds the exception to response.
     *
     * @param response the response
     * @param exception the exception
     */
    private void addExceptionToResponse(HttpServletResponse response, Exception exception) {
        response.setHeader("error-message", exception.getMessage());
        response.setContentType(MediaType.TEXT_PLAIN_VALUE);
        final StringWriter sw = new StringWriter();
        final PrintWriter printWriter = new PrintWriter(sw);
        exception.printStackTrace(printWriter);
        final String stackTrace = sw.toString();
        try {
            response.getOutputStream().print(stackTrace);
        } catch (IOException ioException) {
        }
    }
}
