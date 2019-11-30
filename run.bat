echo "starting script"
cd D:\selenium\working Framework\TestingDemo_11202019\TestingDemo\TestingDemo
mvn clean test -Dcucumber.options="--tags @Test1"
echo "ending script"
pause