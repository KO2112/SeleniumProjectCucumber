package com.example.sil;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "Features", glue = {"stepDefinitions"})
public class Runner {
}
