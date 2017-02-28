package bean;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

import javax.inject.Named;
import javax.inject.Qualifier;
import javax.inject.Singleton;
import java.util.Random;

/**
 * Created by Yang&Yu on 2017/2/25.
 */
@Module
public interface EvenModule {
    @Binds
    @Singleton
    EvenFactory provideEvenFactory(DefaultEvenFactory defaultEvenFactory);

    @Provides
    @Named("IsImportant")
    static boolean provideIsImportant() {
        final boolean isImportant = new Random().nextBoolean();
        return isImportant;
    }

    @Qualifier
    @interface EvenService {
    }
}
