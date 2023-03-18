# circle-ci-test
Testing our app to ensure tests are not failing and app is ready to be uploaded to the github repository.
The circleci is a continuous integration and deployment tool that is used to automate application testing for new commits.
It uses docker container for its build, test, and deployment. It is alos very reliable and works with different languages.
Testing Steps
 - Spin up environment - pull docker images
 - Prepare environment variables
 - Checkout code
 - Build (Spring output in the console)
 - Test (same spring output in itellij console)
When we select the fast option to use circleci's yaml file, there's a compare and pull request displayed in the repo after a build success,
click and update your files with the newly generated file from circleci that includes a yaml file

We added codecov a code coverage tool use to test the health of a software system. It is the percentage of lines of code in a project that are validated through a software test. It also displays the percentage of lines or classes tested and those tat have not been tested. 
