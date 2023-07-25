package com.example;

import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.javaoperatorsdk.operator.api.reconciler.Context;
import io.javaoperatorsdk.operator.api.reconciler.ControllerConfiguration;
import io.javaoperatorsdk.operator.api.reconciler.Reconciler;
import io.javaoperatorsdk.operator.api.reconciler.UpdateControl;

@ControllerConfiguration
public class ExampleController implements Reconciler<Deployment> {
	public UpdateControl<Deployment> reconcile(Deployment deploy, Context<Deployment> ctx) {
		System.out.println("I'm a dummy reconciler");
		return UpdateControl.noUpdate();
	}
}
