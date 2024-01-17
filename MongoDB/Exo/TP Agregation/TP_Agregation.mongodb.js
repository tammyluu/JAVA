use("livre")

// --1.	Trier les publications de « Toru Ishida » par titre de livre et par page de début.
// db.livres.aggregate([{$match: { authors: "Toru Ishida" }},
//  {$sort: {title : 1, "page.start" : 1 }}])

// --3.	Compter le nombre de ses publications.
// db.livres.aggregate([{$match: { authors: "Toru Ishida" }},
//   {$group: {_id: "$authors",totalPublications:{$sum:1}}}])


// -- 4.	Compter le nombre de publications depuis 2011 et par type.
// db.livres.aggregate([
//     { $match: { "year": { $gte: 2011 } } },
//      { $group: {_id: "$type",totalPublications: { $sum: 1 }}}
//   ])
  

// --5.	Compter le nombre de publications par auteur et trier le résultat par ordre croissant.
db.livres.aggregate([{ $group: {_id: "$authors",totalPublications: { $sum: 1 }}}, 
{$sort: {totalPublications: 1}}])
