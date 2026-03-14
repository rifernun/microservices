package com.richard.accounts.exception;

import com.richard.accounts.dto.ErrorResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice //se acontecer algum erro em QUALQUER lugar da aplicação, ele vai cair aqui e tratar o erro
public class GlobalExceptionHandler extends RuntimeException {

    @ExceptionHandler(CustomerAlreadyExistsException.class) //se acontecer um erro do tipo CustomerAlreadyExistsException, ele vai cair aqui e tratar o erro
    public ResponseEntity<ErrorResponseDto> handleCustomerAlreadyExistsException(CustomerAlreadyExistsException ex, WebRequest webRequest) {
        ErrorResponseDto errorResponseDto = new ErrorResponseDto(
                webRequest.getDescription(false), //retorna o caminho da requisição que causou o erro
                HttpStatus.BAD_REQUEST,
                ex.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(errorResponseDto, HttpStatus.BAD_REQUEST);
    }
}
