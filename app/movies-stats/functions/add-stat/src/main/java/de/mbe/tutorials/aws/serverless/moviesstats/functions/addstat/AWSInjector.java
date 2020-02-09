package de.mbe.tutorials.aws.serverless.moviesstats.functions.addstat;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import dagger.Component;

@Component(modules = AWSInjectionModule.class)
public interface AWSInjector {
    AmazonDynamoDB injectAmazonDynamoDB();
}
