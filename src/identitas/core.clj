(ns
   ^{:doc " Generate a validated random int-proquint and check a given 
             int-proquint validity"
     :author "Nizal Alshammry and Phillip Lord"}
    identitas.core
  (:gen-class)
  (:import
   (uk.org.russet.identitas   Util   Damm)
   (uk.org.russet.proquint  Proquint)))


(defn random-damm-proint
  "Returns a random int proquint after validate it with checksum."
  []
  (Util/randomDammProint))


(defn proint-damm-valid?
  "Returns a validation of a given int proquint."
  [ident]
  (Util/prointDammValid ident))
 
