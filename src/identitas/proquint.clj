(ns
     ^{:doc "Bi-directional Transformation between numbers and a pronouncable
equivalent."
       :author "Nizal Alshammry and Phillip Lord"}
    identitas.proquint
  (:gen-class)
  (:import
   (uk.org.russet.identitas   Util   Damm)
   (uk.org.russet.proquint  Proquint)))


(defn int-to-proint
  "Returns an int proquint given an int"
  [i]
  (Util/intToProint i))

(defn proint-to-int
   "Returns a int given a int proquint."
  [p]
  (Util/prointToInt p))


(defn short-to-proshort
  "Returns a short proquint given a short."
  [s]
  (Util/shortToProshort s))


(defn proshort-to-short
  "Returns a short given a short proquint."
  [p]
  (Util/proshortToShort p))

(defn long-to-prolong
  "Returns a long proquint given a long."
  [l]
  (Util/longToProlong l))

(defn prolong-to-long
  "Returns a long given a long proquint."
  [p]
  (Util/prolongToLong p))

(defn random-proshort
  "Return a random short proquint"
  []
  (Util/randomProshort))

(defn random-proint
  "Return a random int proquint"
  []
  (Util/randomProint))

(defn random-prolong
  "Return a random long proquint"
  []
  (Util/randomProlong))
