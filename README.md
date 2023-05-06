# surveypagebackend
Video of the demo : [Link to video] (https://gmuedu-my.sharepoint.com/:v:/g/personal/nhunsurd_gmu_edu/ETWmEQt1tVJGrzY3sw70N_IBD7eW5WTCYt0CQ2Uerdktjw?e=GVlUYi)
</br>
Detailed explanation on this [Page] (https://github.com/NagaSumukh/SurveyPage/blob/main/SWE%20-%20645%20Assignment%202.pdf)
</br>
AWS URL of home page: [AWS URL] (https://3.223.167.126/k8s/clusters/c-m-s7478tdz/api/v1/namespaces/default/services/http:deploynp:8080/proxy/surveys/all)

##Task 1: Setting Springboot  
- Initialise Springboot project in spring.io and export it to any IDE and add your code  

##Task 2: Setup RDS
- Set up the free tier RDS instance in AWS and set engine type to MySQL

##Task 3: Push project to Github
- Put the source code into the github repository  

##Task 4: Creating Docker Image. 
- Follow the PDF and create image by running the commands  
- And push it to dockerhub  

##Task 5: Rancher Installtion  
- Create 3 instance in AWS  
- 2 for rancher, worker and 1 for jenkins  
- Install docker in it  
- Run rancher on it  

##Task 5: Add cluster and Deploy  
- Add cluster and create 2 deployments - Nodeport and loadbalancer  
- Get the kube config file and save it  
- When you run the nodeport hyperlink in the services tab you should be able to see the survey page  

##Task 6: Jenkins install and setup  
- Run jenkins on the AWS ec2 instance and then install jenkins  
- Add the kube config file from the rancher which we had downloaded  
- Login to the jenkins configure the necessary changes  
- Add all the plugins, credentials  
- Post the creation of the pipeline we can test by updating the file in the guithub and it will reflect in our website.
