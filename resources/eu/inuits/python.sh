files=`ls -ltr`
echo $files
compile=`find . -name '*.py' -print0| xargs -0 -t -L 1 python2 -m py_compile`
echo $compile
