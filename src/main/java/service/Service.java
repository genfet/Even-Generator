package service;

import bean.EvenFactory;
import bean.EvenModule.EvenService;
import dagger.Component;
import generator.GeneratorModule;

import javax.inject.Singleton;

/**
 * Created by Yang&Yu on 2017/2/25.
 */
@Component(modules = {GeneratorModule.class})
@Singleton
public interface Service {

    EvenFactory get();
}
