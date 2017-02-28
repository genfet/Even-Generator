package generator;

import bean.Even;

import java.util.UUID;

/**
 * Created by Yang&Yu on 2017/2/25.
 */
final class DefaultIdGenerator implements IdGenerator{

    DefaultIdGenerator() {
    }

    public String getId() {
        return UUID.randomUUID().toString();
    }
}
