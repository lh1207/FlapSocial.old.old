plugins {
    id("java")
}

group = "org.flapsocial"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("clj-apache-http:clj-apache-http:2.3.2")
    implementation("org.apache.karaf.http:http:3.0.10")
    implementation("org.apache.felix:org.apache.felix.http:6")
    implementation("org.apache.felix:org.apache.felix.http.servlet-api:1.2.0")
    implementation("org.apache.felix:org.apache.felix.http.whiteboard:4.0.10")
    implementation("org.apache.felix:org.apache.felix.http.sslfilter:1.2.6")
    implementation("org.apache.felix:org.apache.felix.http.proxy:4.0.10")
    implementation("org.apache.felix:org.apache.felix.http.bundle:4.0.10")
    implementation("org.apache.felix:org.apache.felix.http.servlet-api:1.2.0")
    implementation("org.apache.bookkeeper.http:bookkeeper-http:4.16.2")
    implementation("org.apache.bookkeeper.http:http-server:4.16.2")
    implementation("org.apache.felix:org.apache.felix.http.api:3.0.0")
    implementation("org.apache.felix:org.apache.felix.http.whiteboard:4.0.10")
    implementation("org.gaixie.json:json:1.0.0")
    implementation("org-parser:org-parser:0.1.27")
    implementation("org.wso2.orbit.com.googlecode.json-simple:json-simple:1.1.1.wso2v1")
    implementation("org.apache.httpcomponents:httpclient:4.5.13")
    implementation("org-parser:org-parser:0.1.27")
    implementation("parser:parser:1.0.0")
    testImplementation(platform("org.junit:junit-bom:5.9.2"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
}

tasks.test {
    useJUnitPlatform()
}
