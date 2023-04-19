SELECT P.firstName, P.lastName, NVL(A.city, null) AS city, NVL(A.state, null) AS state
  FROM Person P Left outer join Address A on P.personId = A.personId
ORDER BY P.firstName
 