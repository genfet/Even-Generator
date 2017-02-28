package generator;

import bean.EvenModule;
import dagger.Module;
import dagger.Provides;

import javax.inject.Named;
import javax.inject.Singleton;

/**
 * Created by Yang&Yu on 2017/2/25.
 */
@Module(includes = {EvenModule.class})
public interface GeneratorModule {

    @Provides
    @Singleton
    @Named("IdGenerator")
    static IdGenerator provideIdGenerator(){
        return new DefaultIdGenerator();
    }

    @Provides
    @Singleton
    @Named("NameGenerator")
    static NameGenerator provideNameGenerator(){
        return new DefaultNameGenerator();
    }
}
