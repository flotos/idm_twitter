/*
 * generated by Xtext 2.10.0
 */
package org.xtext.geotweet.gtdsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class GTDslStandaloneSetup extends GTDslStandaloneSetupGenerated {

	def static void doSetup() {
		new GTDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
