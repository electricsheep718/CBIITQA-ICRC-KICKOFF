<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Forgot Password</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>9c94d4e0-0bff-4f29-aff3-90b47383e523</testSuiteGuid>
   <testCaseLink>
      <guid>88239fcb-e45f-46d1-8f28-7f6f6ce8eaeb</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Sami Test Cases/ICRC External - Login - Forgot Password</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>78d08025-56a1-4480-b195-c97234d85de8</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>2-2</value>
         </iterationEntity>
         <testDataId>Data Files/ForgotPassword Test Data</testDataId>
      </testDataLink>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>cf8207af-486a-44ef-937f-e843f7fd9aa1</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>3-3</value>
         </iterationEntity>
         <testDataId>Data Files/Registration Sami</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>78d08025-56a1-4480-b195-c97234d85de8</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>04b667c6-ed59-4e64-8c71-847dce039aaa</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>78d08025-56a1-4480-b195-c97234d85de8</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>confirm password</value>
         <variableId>86b69079-1a19-4eb0-a177-41be1b9e0d36</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>78d08025-56a1-4480-b195-c97234d85de8</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>login password</value>
         <variableId>a357a7cd-13c4-4cb7-9d41-694b2e0204b4</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>cf8207af-486a-44ef-937f-e843f7fd9aa1</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>EmailAddress</value>
         <variableId>0fe86c4a-f0aa-4d39-a5c4-3fd3294b4638</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
