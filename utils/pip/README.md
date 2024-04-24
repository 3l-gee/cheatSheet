# PIP 101

Install a package
```python
pip install SomePackage                         # latest version
pip install "SomePackage==1.0.4"                # specific version
pip install "SomePackage>=1.0.4"                # minimum version
pip install https://example.com/SomePackage.whl # from URL

```
uninstall a package
```bash
pip uninstall SomePackage
```

Search for package
```bash
pip search SomePackage
```

Show package information
```bash
pip show SomePackage
```

Install a list of package 
```bash
pip install -r requirements.txt
```

Requirement exemple :
```bash
SomePackage==3.0
```

Upgrade preinstalled
```bash
pip install --upgrade SomePackage
```

Export current requirement
```bash
pip freeze > requirements.txt       
pip freeze --all > requirements.txt             #Case with Transitive Dependencies
```

Lists requirement
```bash
pip list
```