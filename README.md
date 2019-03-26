# MavenSampleOracleJdbc
Maven sample project for use a Oracle JDBC Driver

# How to use on local environment

change ${OTN_USERNAME} by your Oracle login in test/mvnsettings.xml file

change ${OTN_PASSWORD} by your Oracle password in test/mvnsettings.xml file

```
mvn clean install --settings test/mvnsettings.xml
```

# How to install Maven in Mac
brew update
brew install maven

# Verify Macen
which mvn

# Check Maven version
mvn -v


# How to verify Oracle connection in Java
Oracle11GDebianTest.java
Run the above file in Eclipse or any other editor

# Expected result
Connecting to database...
Connected



# License

BSD-3-Clause + Oracle Technology Network License Agreement, See LICENSE for details
