/*
 * generated by Xtext 2.22.0
 */
package com.github.toerob.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import com.github.toerob.tests.Inform6InjectorProvider
import com.github.toerob.inform6.Program

@ExtendWith(InjectionExtension)
@InjectWith(Inform6InjectorProvider)
class ParsingTest {
	@Inject
	ParseHelper<Program> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
     
     		Object testObject "testObject"
     			with 
     				property1 "string",
     				property2 123,
     				property3 'string array element 2' 'string array element 2'
     			has light openable	
     		;

		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}
