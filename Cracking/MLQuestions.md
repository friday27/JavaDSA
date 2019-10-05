# TODO: write a Python and c++ script to do random test
# * for each question, - for hints
# try to make examples for each question
# watch a video -> solve inknown questions -> review -> new video

Ref: (1 file for 1 video)
https://www.youtube.com/watch?v=hB1CTizqGFk&t=102s

* different types of ML
    - Supervised Learning: 
        the model will predict based on past data, ex classify
    - Unsupervised Learning: 
        the model is able to identify patterns and relationships in the input data (not labor data), ex cluster
    - Reinforcement Learning:
        the model is able to learn based on the feedback for its previous action (learn -> perform -> feedback), ex alpha go

* overfitting and how to avoid it
    - Overfitting
        occurs when the model learns training data too well. It takes random fluctuations (unimportant messagess) as concepts, thus cannot be applied to new input data, ex. learns background noise as a signal
    - there are 3 main methods to avoid overfitting
        1) regularizatoin - the most common method 
        2) make a simple model - lesser variables and parameters
        3) cross-validation - ex. k-fold

* what is training/test set? how many data?
    - training set are labeled examples to be learned by the model, usually 70% of all data is taken as training set     
    - test set is used to test the accuracy of the model, usually 30% is taken as test set

* how do you handle missing or corrupted data?
    - drop the attr (or col or row)
    - replace it with some other value

* how to choose a classifier
    - small training set
        the model with high bias and low variance, since it's less likely to overfit (ex. Native Bayes)
    - large training data
        the model with low bias and high variance, since it works fine when complex relationships come up (ex. decision tree)

* explain confusion matrix or error matrix
    - confusion matrix measures the performance of a model
    - there are 2 dimensions in a confusion matrix:
        1) actual
        2) predicted

* confusion matrix - what's false positive and false negative?
    - false positive
        are those cases which are wrongly classified as true but actually it's false (the model rings a bell by mistake)
    - false negative
        are wrongly predicted as false but true
    - precision [1/(1+2)]
        = actual true & predicted true / predicted true
    - recall [1/(1+3)]
        = predicted true & actual true / (predicted false & actual false + predicted true & actual true)    

* steps to build a ML model
    - (1) model building: choose a algorithms and train it
    - (2) model testing: check accuracy through new test data
    - (3) applying the model: make required changes after testing and apply the final model (apply for real time project)

* what is deep learning
    - DL is a part of ML. 
    - It involves systems that think and learn like humans using artificial neural netwroks

* differences between ML and DL
    - DL
        1) enable machines to take decisions by artificial neural network
        2) needs a large amount of training data
        3) needs high end system to wrok
        4) learns the features from data
        5) the problem is solved in an end-to-end manner
    - ML
        1) needs only a small amount of data
        2) works well on low-end system
        3) most features need to be manually coded
        4) the problem is divided into parts, solved seperatly and combined

* applications of supervised ML
    - Siri
    - email spam detection
    - sentiment anlysis
    - healthcare diagnosis
    - fraud detection

* what is semi supervised ML
    - the training data contains of a small amount of labeled data and a large amount of unlabeled data

* unsupervised ML techniques
    - clustering
        divided data into subsets
    - association
        make a recommendation list

* difference between inductive ML and deductive ML
    - inductive learning
        it observes instances based on defined principles to draw conclusion
    - deductive learning
        it draws conclusion from already defined general principles

* compare k-means and knn
    - k-means
        1) unsupervised
        2) a clustering algorithm
    - knn
        1) supervised
        2) a classification algorithm

* what is naive bayes clasifier
    - it's called navie because it makes assumptions that might be wrong
    - it assumes one feature of a class is to related to any other features (abs independence of features)

* explain how to play chess using reinforcement learning
    - a move -> positive or negative feedback (reward or punishment)

* how to choose ML algorithms for a classification problem
    - thers's no perfect answer
    - if accuracy is concerned
        one can test different algorithms and do cross validate
    - small training dataset
        use model that have low var and high bias
    - large training dataset
        use model that have high var and low bias

* explain assiciation algorithm (recommendation engine)
    - 

* when classification > regression
    - classification
        target var = categorical (ex. gender, color)
    - regression
        target var = continous (ex. price, score)

* how to decide an email spam filter
    - thousands of labeled emails -> learn patterns (decision tree, SVN..)

* explain random forest
    - use multiple decision trees, the decision of majority of trees is chosen by the random forest as the final decision

* how to choose ML model
    - outputs is continues
        1) linear regression
    - category
        1) logistic regression
        2) decision
        3) random forest
        4) knn
        5) naive bayes
    - a cluster
        1) k means
        2) hierarchical clustering
        3) PCA
    - an image or audio
        1) neural network
    - an association
        1) apriori
    - non-linear interaction data
        1) boosting
        2) bagging 

* what is bias and var in ML models
    - bias
        the predicted value are different from the actual value
    - variance
        refers to the amount the target model will change when trained with different training data

* what is trade-off between bias and var
    - 

* explain pruning decision tree
    - reduce the size of the tree
        top-down, bottom-up
    - reduce overfitting
    - case: reduced error pruning

* explain logistic regression
    - output is either 0 or 1
    - the threshold is usually 0.5

