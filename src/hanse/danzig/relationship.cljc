(ns hanse.danzig.relationship)

#?(:clj (derive java.lang.Number :danzig/number)
   :cljs (derive js/Number :danzig/number))
(derive :danzig/number :danzig/value)
#?(:clj (derive clojure.lang.Keyword :danzig/keyword)
   :cljs (derive cljs.core/Keyword :danzig/keyword))
#?(:clj (derive java.lang.String :danzig/string)
   :cljs (derive js/String :danzig/string))
(derive :danzig/string :danzig/value)
#?(:clj (derive java.util.Collection :danzig/collection)
   :cljs (do (derive cljs.core/PersistentVector :danzig/collection)
             (derive cljs.core/LazySeq :danzig/collection)))
#?(:clj (derive java.util.Map :danzig/map)
   :cljs (do (derive cljs.core/PersistentArrayMap :danzig/map)
             (derive cljs.core/PersistentHashMap :danzig/map)))
(derive :danzig/keyword :danzig/value)
#?(:clj (derive java.lang.Object :danzig/any)
   :cljs (derive js/Object :danzig/any))
#?(:cljs (derive :danzig/number :danzig/any))
#?(:cljs (derive :danzig/keyword :danzig/any))
#?(:cljs (derive :danzig/string :danzig/any))
#?(:cljs (derive :danzig/collection :danzig/any))
#?(:cljs (derive :danzig/map :danzig/any))

#?(:clj (derive clojure.lang.Fn :danzig/fn)
   :cljs (derive js/Function :danzig/fn))
#?(:clj (derive clojure.lang.ArraySeq :danzig/seq)
   :cljs (derive cljs.core/IndexedSeq :danzig/seq))
(derive :danzig/keyword :danzig/column-name)
(derive :danzig/string :danzig/column-name)
