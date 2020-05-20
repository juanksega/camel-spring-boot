/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.resteasy.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Expose REST endpoints and access external REST servers.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.resteasy")
public class ResteasyComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the resteasy component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Sets httpRegistry which can be externalized to be used by camel. The
     * option is a org.apache.camel.http.common.HttpRegistry type.
     */
    private String httpRegistry;
    /**
     * Sets the proxy class for consumer enpoints
     */
    private String proxyConsumersClasses;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;
    /**
     * To use a custom org.apache.http.client.CookieStore. By default the
     * org.apache.http.impl.client.BasicCookieStore is used which is an
     * in-memory only cookie store. Notice if bridgeEndpoint=true then the
     * cookie store is forced to be a noop cookie store as cookie shouldn't be
     * stored as we are just bridging (eg acting as a proxy). The option is a
     * org.apache.http.client.CookieStore type.
     */
    private String cookieStore;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * Whether to allow java serialization when a request uses
     * context-type=application/x-java-serialized-object. This is by default
     * turned off. If you enable this then be aware that Java will deserialize
     * the incoming data from the request to Java and that can be a potential
     * security risk.
     */
    private Boolean allowJavaSerializedObject = false;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * To use a custom and shared HttpClientConnectionManager to manage
     * connections. If this has been configured then this is always used for all
     * endpoints created by this component. The option is a
     * org.apache.http.conn.HttpClientConnectionManager type.
     */
    private String clientConnectionManager;
    /**
     * The maximum number of connections per route.
     */
    private Integer connectionsPerRoute = 20;
    /**
     * The time for connection to live, the time unit is millisecond, the
     * default value is always keep alive.
     */
    private Long connectionTimeToLive;
    /**
     * To use a custom HttpBinding to control the mapping between Camel message
     * and HttpClient. The option is a org.apache.camel.http.common.HttpBinding
     * type.
     */
    private String httpBinding;
    /**
     * To use the custom HttpClientConfigurer to perform configuration of the
     * HttpClient that will be used. The option is a
     * org.apache.camel.component.http.HttpClientConfigurer type.
     */
    private String httpClientConfigurer;
    /**
     * To use the shared HttpConfiguration as base configuration. The option is
     * a org.apache.camel.http.common.HttpConfiguration type.
     */
    private String httpConfiguration;
    /**
     * To use a custom org.apache.http.protocol.HttpContext when executing
     * requests. The option is a org.apache.http.protocol.HttpContext type.
     */
    private String httpContext;
    /**
     * The maximum number of connections.
     */
    private Integer maxTotalConnections = 200;
    /**
     * To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter
     * header to and from Camel message. The option is a
     * org.apache.camel.spi.HeaderFilterStrategy type.
     */
    private String headerFilterStrategy;
    /**
     * To configure security using SSLContextParameters. Important: Only one
     * instance of org.apache.camel.support.jsse.SSLContextParameters is
     * supported per HttpComponent. If you need to use 2 or more different
     * instances, you need to define a new HttpComponent per instance you need.
     * The option is a org.apache.camel.support.jsse.SSLContextParameters type.
     */
    private String sslContextParameters;
    /**
     * Enable usage of global SSL context parameters.
     */
    private Boolean useGlobalSslContextParameters = false;
    /**
     * To use a custom X509HostnameVerifier such as DefaultHostnameVerifier or
     * NoopHostnameVerifier. The option is a javax.net.ssl.HostnameVerifier
     * type.
     */
    private String x509HostnameVerifier;
    /**
     * The timeout in milliseconds used when requesting a connection from the
     * connection manager. A timeout value of zero is interpreted as an infinite
     * timeout. A timeout value of zero is interpreted as an infinite timeout. A
     * negative value is interpreted as undefined (system default).
     */
    private Integer connectionRequestTimeout = -1;
    /**
     * Determines the timeout in milliseconds until a connection is established.
     * A timeout value of zero is interpreted as an infinite timeout. A timeout
     * value of zero is interpreted as an infinite timeout. A negative value is
     * interpreted as undefined (system default).
     */
    private Integer connectTimeout = -1;
    /**
     * Defines the socket timeout in milliseconds, which is the timeout for
     * waiting for data or, put differently, a maximum period inactivity between
     * two consecutive data packets). A timeout value of zero is interpreted as
     * an infinite timeout. A negative value is interpreted as undefined (system
     * default).
     */
    private Integer socketTimeout = -1;

    public String getHttpRegistry() {
        return httpRegistry;
    }

    public void setHttpRegistry(String httpRegistry) {
        this.httpRegistry = httpRegistry;
    }

    public String getProxyConsumersClasses() {
        return proxyConsumersClasses;
    }

    public void setProxyConsumersClasses(String proxyConsumersClasses) {
        this.proxyConsumersClasses = proxyConsumersClasses;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public String getCookieStore() {
        return cookieStore;
    }

    public void setCookieStore(String cookieStore) {
        this.cookieStore = cookieStore;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getAllowJavaSerializedObject() {
        return allowJavaSerializedObject;
    }

    public void setAllowJavaSerializedObject(Boolean allowJavaSerializedObject) {
        this.allowJavaSerializedObject = allowJavaSerializedObject;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public String getClientConnectionManager() {
        return clientConnectionManager;
    }

    public void setClientConnectionManager(String clientConnectionManager) {
        this.clientConnectionManager = clientConnectionManager;
    }

    public Integer getConnectionsPerRoute() {
        return connectionsPerRoute;
    }

    public void setConnectionsPerRoute(Integer connectionsPerRoute) {
        this.connectionsPerRoute = connectionsPerRoute;
    }

    public Long getConnectionTimeToLive() {
        return connectionTimeToLive;
    }

    public void setConnectionTimeToLive(Long connectionTimeToLive) {
        this.connectionTimeToLive = connectionTimeToLive;
    }

    public String getHttpBinding() {
        return httpBinding;
    }

    public void setHttpBinding(String httpBinding) {
        this.httpBinding = httpBinding;
    }

    public String getHttpClientConfigurer() {
        return httpClientConfigurer;
    }

    public void setHttpClientConfigurer(String httpClientConfigurer) {
        this.httpClientConfigurer = httpClientConfigurer;
    }

    public String getHttpConfiguration() {
        return httpConfiguration;
    }

    public void setHttpConfiguration(String httpConfiguration) {
        this.httpConfiguration = httpConfiguration;
    }

    public String getHttpContext() {
        return httpContext;
    }

    public void setHttpContext(String httpContext) {
        this.httpContext = httpContext;
    }

    public Integer getMaxTotalConnections() {
        return maxTotalConnections;
    }

    public void setMaxTotalConnections(Integer maxTotalConnections) {
        this.maxTotalConnections = maxTotalConnections;
    }

    public String getHeaderFilterStrategy() {
        return headerFilterStrategy;
    }

    public void setHeaderFilterStrategy(String headerFilterStrategy) {
        this.headerFilterStrategy = headerFilterStrategy;
    }

    public String getSslContextParameters() {
        return sslContextParameters;
    }

    public void setSslContextParameters(String sslContextParameters) {
        this.sslContextParameters = sslContextParameters;
    }

    public Boolean getUseGlobalSslContextParameters() {
        return useGlobalSslContextParameters;
    }

    public void setUseGlobalSslContextParameters(
            Boolean useGlobalSslContextParameters) {
        this.useGlobalSslContextParameters = useGlobalSslContextParameters;
    }

    public String getX509HostnameVerifier() {
        return x509HostnameVerifier;
    }

    public void setX509HostnameVerifier(String x509HostnameVerifier) {
        this.x509HostnameVerifier = x509HostnameVerifier;
    }

    public Integer getConnectionRequestTimeout() {
        return connectionRequestTimeout;
    }

    public void setConnectionRequestTimeout(Integer connectionRequestTimeout) {
        this.connectionRequestTimeout = connectionRequestTimeout;
    }

    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public Integer getSocketTimeout() {
        return socketTimeout;
    }

    public void setSocketTimeout(Integer socketTimeout) {
        this.socketTimeout = socketTimeout;
    }
}