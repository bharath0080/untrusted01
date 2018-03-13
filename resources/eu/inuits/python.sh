find /var/tmp/JENKINS/workspace/python-projects/puppetboard/ -name '*.py' -print0 | xargs -0 -L 1 python2 -m py_compile 
