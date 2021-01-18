Question - Name both a good and a bad use case for using MongoDB (or some other document/object
store).

MongoDB / In Memory Data Stores such as Reddis , HSQLDB have its own pros and cons against a traditional datastore.

Good Case.

Applicaiton Data Caching - This is the best usecase possible where application data (like Master Data) can be easily stored and fetched directly from Database which avoids a traditional database (mostly RDBMS) transcation. As its Non Blocking IO and In-Memory data increases Performance of the same. With Shards & Replicas Applications can be cached even under a loadBalanced Infrastructure! . Hower this comes with a price which will be stated in cons.

Bad Case

Cost of Infra & Traditional Systems - As this utilizes In-Memory approach, the RAM is high, even if its intended to make use of Secondary Memory, SSDs are recommend which is costs high. Since this does not follow RDBMS approach, Querying in MongoDB becomes complex.

