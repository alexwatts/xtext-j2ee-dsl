/*
 * generated by Xtext
 */
package jpadsl.generator

import com.google.inject.Inject
import jpadsl.jPADsl.Entity
import jpadsl.jPADsl.PackageDeclaration

class PersistenceXMLGenerator  {
	
	@Inject extension JPADslGeneratorExtensions generatorExtensions	
	
	def compile(PackageDeclaration p) ''' 
<?xml version="1.0" encoding="UTF-8"?>
<!--~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  ~ persistence.xml
  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~-->
<!-- $Revision: 6314 $ $Date: 2009-10-08 09:31:23 -0500 (Thu, 08 Oct 2009) $ -->
<persistence xmlns="http://java.sun.com/xml/ns/persistence"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://java.sun.com/xml/ns/persistence
          http://java.sun.com/xml/ns/persistence/persistence_1_0.xsd"
	version="1.0">

<persistence-unit name="testPU" transaction-type="RESOURCE_LOCAL">
    <provider>org.hibernate.ejb.HibernatePersistence</provider>
    <mapping-file>META-INF/orm.xml</mapping-file>
    <!-- When running in J2SE Hibernate needs all classes listed here -->
    «FOR e:p.elements.filter(typeof(Entity))»
    <class>«e.packageName».«e.name»</class>
    «ENDFOR»
    <properties>
    	<property name="hibernate.archive.autodetection" value="class, hbm"/>
        <property name="hibernate.connection.url" value="jdbc:hsqldb:mem:unit-testing-jpa"/>
        <property name="hibernate.connection.driver_class" value="org.hsqldb.jdbcDriver"/>
        <property name="hibernate.dialect" value="org.hibernate.dialect.HSQLDialect"/>
        <property name="hibernate.hbm2ddl.auto" value="create-drop"/>
        <property name="hibernate.connection.username" value="sa"/>
        <property name="hibernate.connection.password" value=""/>
        <property name="hibernate.show_sql" value="true"/>
        <property name="hibernate.format_sql" value="true"/>
    </properties>
</persistence-unit>

</persistence>
	'''

}