// aggregation:

use("restau");
db.restaurant.aggregate({$match: {rating:5}},{$count : "toto"});
