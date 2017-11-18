{:namespaces
 ({:doc
   " Generate a validated random int-proquint and check a given \nint-proquint validity",
   :author "Nizal Alshammry and Phillip Lord",
   :name "identitas.core",
   :wiki-url "identitas.core-api.html",
   :source-url nil}
  {:doc
   "Validate integers with a check-digit according to the Damm algorithm.",
   :author "Nizal Alshammry and Phillip Lord",
   :name "identitas.damm",
   :wiki-url "identitas.damm-api.html",
   :source-url nil}
  {:doc
   "Bi-directional Transformation between numbers and a pronouncable\nequivalent.",
   :author "Nizal Alshammry and Phillip Lord",
   :name "identitas.proquint",
   :wiki-url "identitas.proquint-api.html",
   :source-url nil}),
 :vars
 ({:raw-source-url nil,
   :name "proint-damm-valid?",
   :file "src/identitas/core.clj",
   :source-url nil,
   :line 18,
   :var-type "function",
   :arglists ([ident]),
   :doc "Returns a validation of a given int proquint.",
   :namespace "identitas.core",
   :wiki-url
   "/identitas.core-api.html#identitas.core/proint-damm-valid?"}
  {:raw-source-url nil,
   :name "random-damm-proint",
   :file "src/identitas/core.clj",
   :source-url nil,
   :line 12,
   :var-type "function",
   :arglists ([]),
   :doc
   "Returns a random int proquint after validate it with checksum.",
   :namespace "identitas.core",
   :wiki-url
   "/identitas.core-api.html#identitas.core/random-damm-proint"}
  {:raw-source-url nil,
   :name "valid?",
   :file "src/identitas/damm.clj",
   :source-url nil,
   :line 11,
   :var-type "function",
   :arglists ([number]),
   :doc "Returns a boolean given a number",
   :namespace "identitas.damm",
   :wiki-url "/identitas.damm-api.html#identitas.damm/valid?"}
  {:raw-source-url nil,
   :name "int-to-proint",
   :file "src/identitas/proquint.clj",
   :source-url nil,
   :line 12,
   :var-type "function",
   :arglists ([i]),
   :doc "Returns an int proquint given an int",
   :namespace "identitas.proquint",
   :wiki-url
   "/identitas.proquint-api.html#identitas.proquint/int-to-proint"}
  {:raw-source-url nil,
   :name "long-to-prolong",
   :file "src/identitas/proquint.clj",
   :source-url nil,
   :line 34,
   :var-type "function",
   :arglists ([l]),
   :doc "Returns a long proquint given a long.",
   :namespace "identitas.proquint",
   :wiki-url
   "/identitas.proquint-api.html#identitas.proquint/long-to-prolong"}
  {:raw-source-url nil,
   :name "proint-to-int",
   :file "src/identitas/proquint.clj",
   :source-url nil,
   :line 17,
   :var-type "function",
   :arglists ([p]),
   :doc "Returns a int given a int proquint.",
   :namespace "identitas.proquint",
   :wiki-url
   "/identitas.proquint-api.html#identitas.proquint/proint-to-int"}
  {:raw-source-url nil,
   :name "prolong-to-long",
   :file "src/identitas/proquint.clj",
   :source-url nil,
   :line 39,
   :var-type "function",
   :arglists ([p]),
   :doc "Returns a long given a long proquint.",
   :namespace "identitas.proquint",
   :wiki-url
   "/identitas.proquint-api.html#identitas.proquint/prolong-to-long"}
  {:raw-source-url nil,
   :name "proshort-to-short",
   :file "src/identitas/proquint.clj",
   :source-url nil,
   :line 29,
   :var-type "function",
   :arglists ([p]),
   :doc "Returns a short given a short proquint.",
   :namespace "identitas.proquint",
   :wiki-url
   "/identitas.proquint-api.html#identitas.proquint/proshort-to-short"}
  {:raw-source-url nil,
   :name "random-proint",
   :file "src/identitas/proquint.clj",
   :source-url nil,
   :line 49,
   :var-type "function",
   :arglists ([]),
   :doc "Return a random int proquint",
   :namespace "identitas.proquint",
   :wiki-url
   "/identitas.proquint-api.html#identitas.proquint/random-proint"}
  {:raw-source-url nil,
   :name "random-prolong",
   :file "src/identitas/proquint.clj",
   :source-url nil,
   :line 54,
   :var-type "function",
   :arglists ([]),
   :doc "Return a random long proquint",
   :namespace "identitas.proquint",
   :wiki-url
   "/identitas.proquint-api.html#identitas.proquint/random-prolong"}
  {:raw-source-url nil,
   :name "random-proshort",
   :file "src/identitas/proquint.clj",
   :source-url nil,
   :line 44,
   :var-type "function",
   :arglists ([]),
   :doc "Return a random short proquint",
   :namespace "identitas.proquint",
   :wiki-url
   "/identitas.proquint-api.html#identitas.proquint/random-proshort"}
  {:raw-source-url nil,
   :name "short-to-proshort",
   :file "src/identitas/proquint.clj",
   :source-url nil,
   :line 23,
   :var-type "function",
   :arglists ([s]),
   :doc "Returns a short proquint given a short.",
   :namespace "identitas.proquint",
   :wiki-url
   "/identitas.proquint-api.html#identitas.proquint/short-to-proshort"})}
