package spring.audit.config;

import spring.audit.type.DatabaseType;
import spring.audit.type.StringConvertCase;

public interface AuditConfigurer {

    default StringConvertCase convertCase() {
        return StringConvertCase.CAMEL_TO_SNAKE;
    }

    default DatabaseType databaseType() {
        return DatabaseType.ORACLE;
    }

}