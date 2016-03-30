### Pull image
FROM docker-registry.cc.emory.edu:443/emory-first-cache-primer

### Swap out the updated emoryFirstCache.war
ADD target/emoryFirstCache.war /opt/jboss/jboss-eap-6.4/standalone/deployments/emoryFirstCache.war
