package sflima.weatherapp.utils;

import com.google.common.base.CaseFormat;
import org.springframework.http.HttpHeaders;

public final class EntityAlertUtil {

    private static final String APPLICATION_NAME = "weatherApp";

    private EntityAlertUtil() {
    }

    public static HttpHeaders createAlert(final String message, final String param) {
        return HeaderUtil.createAlert(APPLICATION_NAME, message, param);
    }

    public static HttpHeaders createEntityCreationAlert(final Class<?> className, final String param) {
        final String entityName = convertToEntityName(className);
        return HeaderUtil.createEntityCreationAlert(APPLICATION_NAME, true, entityName, param);
    }

    public static HttpHeaders createEntityUpdateAlert(final Class<?> className, final String param) {
        final String entityName = convertToEntityName(className);
        return HeaderUtil.createEntityUpdateAlert(APPLICATION_NAME, true, entityName, param);
    }


    public static HttpHeaders createEntityDeletionAlert(final Class<?> className, final String param) {
        final String entityName = convertToEntityName(className);
        return HeaderUtil.createEntityDeletionAlert(APPLICATION_NAME, true, entityName, param);
    }

    public static HttpHeaders createFailureAlert(final Class<?> className, final String errorKey, final String defaultMessage) {
        final String entityName = convertToEntityName(className);
        return HeaderUtil.createFailureAlert(APPLICATION_NAME, true, entityName, errorKey, defaultMessage);
    }

    public static String convertToEntityName(Class<?> className) {
        return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, className.getSimpleName());
    }
}
