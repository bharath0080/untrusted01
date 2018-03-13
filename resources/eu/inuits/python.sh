find . -name '*.py' -print0 | xargs  -d '\n' -0  python2 -m py_compile
