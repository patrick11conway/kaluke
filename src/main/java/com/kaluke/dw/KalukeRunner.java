

package com.kaluke.dw;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import com.kaluke.dw.members.MemberResource;

public class KalukeRunner extends Application<KalukeConfig>{

    public static void main(String[] args) throws Exception {
        new KalukeRunner().run(args);
    }

    @Override
    public void initialize(Bootstrap<KalukeConfig> bootstrap) {

    }

    @Override
    public void run(KalukeConfig configuration, Environment environment) throws Exception {
        final MemberResource mr=new MemberResource();
        environment.jersey().register(mr);
    }
}
